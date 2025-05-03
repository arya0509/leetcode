
var TimeLimitedCache = function() {
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.cache=0;
TimeLimitedCache.prototype.cacheObject={};
TimeLimitedCache.prototype.cacheKeyValPairs={};
TimeLimitedCache.prototype.set = function(key, value, duration) {
    this.key=key;
    this.value=value;
    this.duration=duration;
    const ref=this.timeOut(duration,key);
    if(this.cacheObject.hasOwnProperty(key)){
        clearTimeout(this.cacheObject[key]);
        this.cacheObject[key]=ref;
        this.cacheKeyValPairs[key]=value;
        return true;
    }
    this.cacheObject[key]=ref;
    this.cacheKeyValPairs[key]=value;

    this.cache++;
    return false;    
};
TimeLimitedCache.prototype.timeOut = function(duration,key) {
    const ref=setTimeout(()=>{
        delete this.cacheObject[key];     
        this.cache--;
    },duration);
    return ref;
    
};
/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    if(!this.cacheObject.hasOwnProperty(key)){
        return -1;
    }
    return this.cacheKeyValPairs[key];
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    return this.cache;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */