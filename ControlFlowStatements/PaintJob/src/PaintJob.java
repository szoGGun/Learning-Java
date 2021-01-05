public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double howManyBuckets = area / areaPerBucket;
        return (int) Math.ceil(howManyBuckets)-extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double wallArea = width * height;
        double howManyBuckets = wallArea / areaPerBucket;
        return (int) Math.ceil(howManyBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double howManyBuckets = area / areaPerBucket;
        return (int) Math.ceil(howManyBuckets);
    }
}


