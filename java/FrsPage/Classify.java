package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Classify extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_CLASS_ID = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Classify> {
        public Integer class_id;
        public String class_name;
        public Long id;
        public String name;

        public Builder() {
        }

        public Builder(Classify classify) {
            super(classify);
            if (classify == null) {
                return;
            }
            this.name = classify.name;
            this.id = classify.id;
            this.class_id = classify.class_id;
            this.class_name = classify.class_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Classify build(boolean z) {
            return new Classify(this, z);
        }
    }

    public Classify(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Integer num = builder.class_id;
            if (num == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = num;
            }
            String str2 = builder.class_name;
            if (str2 == null) {
                this.class_name = "";
                return;
            } else {
                this.class_name = str2;
                return;
            }
        }
        this.name = builder.name;
        this.id = builder.id;
        this.class_id = builder.class_id;
        this.class_name = builder.class_name;
    }
}
