'''Write a solution to correct the errors:

The grade column is stored as floats, convert it to integers.

The result format is in the following example.'''

#CODE:
import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    students = students.astype({'grade': int})
    return students