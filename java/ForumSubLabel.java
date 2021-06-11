package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class ForumSubLabel extends Message {
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_SUB_LABEL_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_label_name;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ForumSubLabel> {
        public Integer id;
        public String sub_label_name;

        public Builder() {
        }

        public Builder(ForumSubLabel forumSubLabel) {
            super(forumSubLabel);
            if (forumSubLabel == null) {
                return;
            }
            this.id = forumSubLabel.id;
            this.sub_label_name = forumSubLabel.sub_label_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSubLabel build(boolean z) {
            return new ForumSubLabel(this, z);
        }
    }

    public ForumSubLabel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.sub_label_name;
            if (str == null) {
                this.sub_label_name = "";
                return;
            } else {
                this.sub_label_name = str;
                return;
            }
        }
        this.id = builder.id;
        this.sub_label_name = builder.sub_label_name;
    }
}
