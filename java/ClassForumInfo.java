package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ClassForumInfo extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RecommendForumInfo> forum_info;
    public static final List<RecommendForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
    public static final Integer DEFAULT_CLASS_ID = 0;

    private ClassForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_info == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
            } else {
                this.forum_info = immutableCopyOf(builder.forum_info);
            }
            if (builder.class_id == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = builder.class_id;
            }
            if (builder.class_name == null) {
                this.class_name = "";
                return;
            } else {
                this.class_name = builder.class_name;
                return;
            }
        }
        this.forum_info = immutableCopyOf(builder.forum_info);
        this.class_id = builder.class_id;
        this.class_name = builder.class_name;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ClassForumInfo> {
        public Integer class_id;
        public String class_name;
        public List<RecommendForumInfo> forum_info;

        public Builder() {
        }

        public Builder(ClassForumInfo classForumInfo) {
            super(classForumInfo);
            if (classForumInfo != null) {
                this.forum_info = ClassForumInfo.copyOf(classForumInfo.forum_info);
                this.class_id = classForumInfo.class_id;
                this.class_name = classForumInfo.class_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ClassForumInfo build(boolean z) {
            return new ClassForumInfo(this, z);
        }
    }
}
