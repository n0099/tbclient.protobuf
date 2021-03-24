package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SubClassItem extends Message {
    public static final String DEFAULT_SUB_CLASS_ICON = "";
    public static final String DEFAULT_SUB_CLASS_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer enable;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sub_class_icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sub_class_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_class_name;
    public static final Integer DEFAULT_SUB_CLASS_ID = 0;
    public static final Integer DEFAULT_ENABLE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SubClassItem> {
        public Integer enable;
        public String sub_class_icon;
        public Integer sub_class_id;
        public String sub_class_name;

        public Builder() {
        }

        public Builder(SubClassItem subClassItem) {
            super(subClassItem);
            if (subClassItem == null) {
                return;
            }
            this.sub_class_id = subClassItem.sub_class_id;
            this.sub_class_name = subClassItem.sub_class_name;
            this.sub_class_icon = subClassItem.sub_class_icon;
            this.enable = subClassItem.enable;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubClassItem build(boolean z) {
            return new SubClassItem(this, z);
        }
    }

    public SubClassItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.sub_class_id;
            if (num == null) {
                this.sub_class_id = DEFAULT_SUB_CLASS_ID;
            } else {
                this.sub_class_id = num;
            }
            String str = builder.sub_class_name;
            if (str == null) {
                this.sub_class_name = "";
            } else {
                this.sub_class_name = str;
            }
            String str2 = builder.sub_class_icon;
            if (str2 == null) {
                this.sub_class_icon = "";
            } else {
                this.sub_class_icon = str2;
            }
            Integer num2 = builder.enable;
            if (num2 == null) {
                this.enable = DEFAULT_ENABLE;
                return;
            } else {
                this.enable = num2;
                return;
            }
        }
        this.sub_class_id = builder.sub_class_id;
        this.sub_class_name = builder.sub_class_name;
        this.sub_class_icon = builder.sub_class_icon;
        this.enable = builder.enable;
    }
}
