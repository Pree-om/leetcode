'''There are some rows having missing values in the name column.

Write a solution to remove the rows with missing values.

The result format is in the following example.'''

#CODE:
import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    students.dropna(subset=['name'], inplace=True)
    return students