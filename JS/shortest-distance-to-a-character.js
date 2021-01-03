/**
 * @param {string} S
 * @param {character} C
 * @return {number[]}
 */
var shortestToChar = function (S, C) {
    var ret = [];
    for(var i=0; i<S.length; i++){
        if(S.charAt(i) == C){
            ret[i] = 0;
        }else{
            var lowestFromLeft = 9999999999;
            var lowestFromRight = 999999999;
            for(var x=i; x>=0; x--){
                if(S.charAt(x)==C){
                    lowestFromLeft = i-x;
                    break;
                }
            }
            for(var x=i; x<S.length; x++){
                if (S.charAt(x) == C) {
                    lowestFromRight = x-i;
                    break;
                }
            }
            if(lowestFromLeft < lowestFromRight){
                ret.push(lowestFromLeft);
            }else{
                ret.push(lowestFromRight);
            }
        }
    }
    return ret;
};

console.log(shortestToChar("loveleetcode", 'e'));
console.log(shortestToChar("baaa", "b"));