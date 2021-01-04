package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ClassInfo extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<SubClassItem> sub_class_list;
    public static final Integer DEFAULT_CLASS_ID = 0;
    public static final List<SubClassItem> DEFAULT_SUB_CLASS_LIST = Collections.emptyList();

    private ClassInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.class_id == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = builder.class_id;
            }
            if (builder.class_name == null) {
                this.class_name = "";
            } else {
                this.class_name = builder.class_name;
            }
            if (builder.sub_class_list == null) {
                this.sub_class_list = DEFAULT_SUB_CLASS_LIST;
                return;
            } else {
                this.sub_class_list = immutableCopyOf(builder.sub_class_list);
                return;
            }
        }
        this.class_id = builder.class_id;
        this.class_name = builder.class_name;
        this.sub_class_list = immutableCopyOf(builder.sub_class_list);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ClassInfo> {
        public Integer class_id;
        public String class_name;
        public List<SubClassItem> sub_class_list;

        public Builder() {
        }

        public Builder(ClassInfo classInfo) {
            super(classInfo);
            if (classInfo != null) {
                this.class_id = classInfo.class_id;
                this.class_name = classInfo.class_name;
                this.sub_class_list = ClassInfo.copyOf(classInfo.sub_class_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ClassInfo build(boolean z) {
            return new ClassInfo(this, z);
        }
    }
}
