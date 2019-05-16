package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class Myrecord extends Message {
    public static final String DEFAULT_APPLY_DECLARATION = "";
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer agree_num;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String apply_declaration;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer apply_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer forum_level;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer thread_num;
    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer vote_num;
    public static final Integer DEFAULT_APPLY_ID = 0;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_RANK = 0;
    public static final Integer DEFAULT_FORUM_LEVEL = 0;
    public static final Integer DEFAULT_VOTE_NUM = 0;
    public static final Integer DEFAULT_AGREE_NUM = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Long DEFAULT_TID = 0L;

    private Myrecord(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.apply_id == null) {
                this.apply_id = DEFAULT_APPLY_ID;
            } else {
                this.apply_id = builder.apply_id;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.rank == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = builder.rank;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.name_show == null) {
                this.name_show = "";
            } else {
                this.name_show = builder.name_show;
            }
            if (builder.forum_level == null) {
                this.forum_level = DEFAULT_FORUM_LEVEL;
            } else {
                this.forum_level = builder.forum_level;
            }
            if (builder.vote_num == null) {
                this.vote_num = DEFAULT_VOTE_NUM;
            } else {
                this.vote_num = builder.vote_num;
            }
            if (builder.agree_num == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = builder.agree_num;
            }
            if (builder.thread_num == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = builder.thread_num;
            }
            if (builder.post_num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = builder.post_num;
            }
            if (builder.apply_declaration == null) {
                this.apply_declaration = "";
            } else {
                this.apply_declaration = builder.apply_declaration;
            }
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = builder.tid;
                return;
            }
        }
        this.apply_id = builder.apply_id;
        this.uid = builder.uid;
        this.rank = builder.rank;
        this.portrait = builder.portrait;
        this.name_show = builder.name_show;
        this.forum_level = builder.forum_level;
        this.vote_num = builder.vote_num;
        this.agree_num = builder.agree_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.apply_declaration = builder.apply_declaration;
        this.tid = builder.tid;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<Myrecord> {
        public Integer agree_num;
        public String apply_declaration;
        public Integer apply_id;
        public Integer forum_level;
        public String name_show;
        public String portrait;
        public Integer post_num;
        public Integer rank;
        public Integer thread_num;
        public Long tid;
        public Long uid;
        public Integer vote_num;

        public Builder() {
        }

        public Builder(Myrecord myrecord) {
            super(myrecord);
            if (myrecord != null) {
                this.apply_id = myrecord.apply_id;
                this.uid = myrecord.uid;
                this.rank = myrecord.rank;
                this.portrait = myrecord.portrait;
                this.name_show = myrecord.name_show;
                this.forum_level = myrecord.forum_level;
                this.vote_num = myrecord.vote_num;
                this.agree_num = myrecord.agree_num;
                this.thread_num = myrecord.thread_num;
                this.post_num = myrecord.post_num;
                this.apply_declaration = myrecord.apply_declaration;
                this.tid = myrecord.tid;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Myrecord build(boolean z) {
            return new Myrecord(this, z);
        }
    }
}
