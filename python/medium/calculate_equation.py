import pdb

def calcEquation(equations, values, queries):
    """
    :type equations: List[List[str]]
    :type values: List[float]
    :type queries: List[List[str]]
    :rtype: List[float]
    """
    equation_mapper = {}
    for index, symbol in enumerate(equations):
        numerator = symbol[0]
        denominator = symbol[1]
        result = values[index]
        fsymbol_equality = denominator + ',' + str(result)
        ssymbole_equality = numerator + ',' + str(1/result)
        if numerator in equation_mapper:
            equation_mapper[numerator] += [fsymbol_equality]
        else:
            equation_mapper[numerator] = [fsymbol_equality]

        if denominator in equation_mapper:
            equation_mapper[denominator] += [fsymbol_equality]
        else:
            equation_mapper[denominator] = [ssymbole_equality]
    answers = []

    for equation in queries:
        numerator = equation[0]
        denominator = equation[1]
        if(numerator in equation_mapper and denominator in equation_mapper):
            list_of_eq_enumerator = equation_mapper[numerator]
            list_of_eq_edenominator = equation_mapper[denominator]
            
            breakpoint()
            snumerator = enumerator.split(',')
            sdenominator = edenominator.split(',')
            
            snumeratorsymbol = snumerator[0]
            snumeratorvalue = float(snumerator[1])

            sdenominatorsymbol = sdenominator[0]
            sdenominatorvalue = float(sdenominator[1])

            if snumeratorsymbol == sdenominatorsymbol:
                answers.append(snumeratorvalue / sdenominatorvalue)
            else:
                answers.append(-1)
        else:
            answers.append(-1)
    return answers
