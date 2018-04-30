/**
 * @param {string} s
 * @return {number}
 */
var countSubstrings = function (s) {
    var count = 0;
    for(var i=0; i<s.length; i++){
        var constructedString = "";
        for(var x=i; x<s.length; x++){
            constructedString = constructedString.concat(s.charAt(x));
            if(constructedString == reverse(constructedString)){
                count++;
            }
        }
    }
    return count;
};

function reverse(string){
    var constructedString = "";
    for(var i=string.length; i>=0; i--){
        constructedString = constructedString.concat(string.charAt(i));
    }
    return constructedString;
}
console.log(countSubstrings("aaa"));