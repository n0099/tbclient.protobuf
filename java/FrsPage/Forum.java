package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Forum extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_LEVEL1_DIR_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String level1_dir_name;

    private Forum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.level1_dir_name == null) {
                this.level1_dir_name = "";
                return;
            } else {
                this.level1_dir_name = builder.level1_dir_name;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.level1_dir_name = builder.level1_dir_name;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Forum> {
        public Long forum_id;
        public String level1_dir_name;

        public Builder() {
        }

        public Builder(Forum forum) {
            super(forum);
            if (forum != null) {
                this.forum_id = forum.forum_id;
                this.level1_dir_name = forum.level1_dir_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Forum build(boolean z) {
            return new Forum(this, z);
        }
    }
}
