package org.example.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * Фабричный метод определяет легковесы с помощью name
 * хранит уже созданные легковесы
 * и предоставляет к ним доступ
 */

public class TreeFactory {
    static Map<String, Map<Color, TreeType>> treeTypes = new HashMap<>();

/*
* Определяет уникальность легковеса по его параметрам name и color,
* если уникальный легковес уже существует, то возвращает из коллекции,
* если нет, то в коллекцию добавляется новый уникальный легковес
*/
    public static TreeType getTreeType(String name, Color color) {

        Map<Color, TreeType> colorTreeTypeMap = treeTypes.get(name);
        if (colorTreeTypeMap == null) {
            colorTreeTypeMap = new HashMap<>();
            colorTreeTypeMap.put(color, new TreeType(name, color));
            treeTypes.put(name, colorTreeTypeMap);
        }
        if (!colorTreeTypeMap.containsKey(color)) {
            colorTreeTypeMap.put(color, new TreeType(name, color));
        }
        return colorTreeTypeMap.get(color);
    }
}
