'''Write a solution to concatenate these two DataFrames vertically into one DataFrame.

The result format is in the following example.'''
#CODE:
import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1, df2], axis=0)