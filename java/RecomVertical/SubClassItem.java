package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
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

    private SubClassItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.sub_class_id == null) {
                this.sub_class_id = DEFAULT_SUB_CLASS_ID;
            } else {
                this.sub_class_id = builder.sub_class_id;
            }
            if (builder.sub_class_name == null) {
                this.sub_class_name = "";
            } else {
                this.sub_class_name = builder.sub_class_name;
            }
            if (builder.sub_class_icon == null) {
                this.sub_class_icon = "";
            } else {
                this.sub_class_icon = builder.sub_class_icon;
            }
            if (builder.enable == null) {
                this.enable = DEFAULT_ENABLE;
                return;
            } else {
                this.enable = builder.enable;
                return;
            }
        }
        this.sub_class_id = builder.sub_class_id;
        this.sub_class_name = builder.sub_class_name;
        this.sub_class_icon = builder.sub_class_icon;
        this.enable = builder.enable;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<SubClassItem> {
        public Integer enable;
        public String sub_class_icon;
        public Integer sub_class_id;
        public String sub_class_name;

        public Builder() {
        }

        public Builder(SubClassItem subClassItem) {
            super(subClassItem);
            if (subClassItem != null) {
                this.sub_class_id = subClassItem.sub_class_id;
                this.sub_class_name = subClassItem.sub_class_name;
                this.sub_class_icon = subClassItem.sub_class_icon;
                this.enable = subClassItem.enable;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubClassItem build(boolean z) {
            return new SubClassItem(this, z);
        }
    }
}
