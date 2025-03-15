''' Write a solution to pivot the data so that each row represents temperatures for a specific month, and each city is a separate column.

The result format is in the following example.

'''
#CODE:
import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    pivot_df = weather.pivot(index='month', columns='city', values='temperature')
    return pd.DataFrame(pivot_df)