package cakes;

public enum CakeSize {
    BIG {
        @Override
        public String toString() {
            return "Duży";
        }
    },
    MEDIUM {
        @Override
        public String toString() {
            return "Średni";
        }
    },
    SMALL {
        @Override
        public String toString() {
            return "Mały";
        }
    };
}
