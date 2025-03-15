'''Write a solution to fill in the missing value as 0 in the quantity column.

The result format is in the following example.

'''
#CODE:
import pandas as pd

def fillMissingValues(products: pd.DataFrame) -> pd.DataFrame:
    products['quantity'].fillna(0, inplace=True)
    return products
