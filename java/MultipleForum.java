package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class MultipleForum extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;

    private MultipleForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
                return;
            } else {
                this.forum_name = builder.forum_name;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<MultipleForum> {
        public Long forum_id;
        public String forum_name;

        public Builder() {
        }

        public Builder(MultipleForum multipleForum) {
            super(multipleForum);
            if (multipleForum != null) {
                this.forum_id = multipleForum.forum_id;
                this.forum_name = multipleForum.forum_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MultipleForum build(boolean z) {
            return new MultipleForum(this, z);
        }
    }
}
