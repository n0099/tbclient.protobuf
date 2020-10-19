package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class AddPost extends Message {
    public static final String DEFAULT_LAST_ADDITION_CONTENT = "";
    public static final String DEFAULT_POST_ID = "";
    public static final String DEFAULT_WARN_MSG = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer already_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String last_addition_content;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer last_addition_time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String post_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer total_count;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String warn_msg;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_ALREADY_COUNT = 0;
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    public static final Integer DEFAULT_LAST_ADDITION_TIME = 0;

    private AddPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.post_id == null) {
                this.post_id = "";
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.already_count == null) {
                this.already_count = DEFAULT_ALREADY_COUNT;
            } else {
                this.already_count = builder.already_count;
            }
            if (builder.total_count == null) {
                this.total_count = DEFAULT_TOTAL_COUNT;
            } else {
                this.total_count = builder.total_count;
            }
            if (builder.last_addition_content == null) {
                this.last_addition_content = "";
            } else {
                this.last_addition_content = builder.last_addition_content;
            }
            if (builder.last_addition_time == null) {
                this.last_addition_time = DEFAULT_LAST_ADDITION_TIME;
            } else {
                this.last_addition_time = builder.last_addition_time;
            }
            if (builder.warn_msg == null) {
                this.warn_msg = "";
                return;
            } else {
                this.warn_msg = builder.warn_msg;
                return;
            }
        }
        this.create_time = builder.create_time;
        this.post_id = builder.post_id;
        this.already_count = builder.already_count;
        this.total_count = builder.total_count;
        this.last_addition_content = builder.last_addition_content;
        this.last_addition_time = builder.last_addition_time;
        this.warn_msg = builder.warn_msg;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<AddPost> {
        public Integer already_count;
        public Integer create_time;
        public String last_addition_content;
        public Integer last_addition_time;
        public String post_id;
        public Integer total_count;
        public String warn_msg;

        public Builder() {
        }

        public Builder(AddPost addPost) {
            super(addPost);
            if (addPost != null) {
                this.create_time = addPost.create_time;
                this.post_id = addPost.post_id;
                this.already_count = addPost.already_count;
                this.total_count = addPost.total_count;
                this.last_addition_content = addPost.last_addition_content;
                this.last_addition_time = addPost.last_addition_time;
                this.warn_msg = addPost.warn_msg;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddPost build(boolean z) {
            return new AddPost(this, z);
        }
    }
}
