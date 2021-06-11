package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class HotPost extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<PbContent> content;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 5)
    public final PbPostZan post_zan;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_FLOOR = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<HotPost> {
        public List<PbContent> content;
        public Integer create_time;
        public Integer floor;
        public String portrait;
        public Long post_id;
        public Integer post_num;
        public PbPostZan post_zan;
        public Long thread_id;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(HotPost hotPost) {
            super(hotPost);
            if (hotPost == null) {
                return;
            }
            this.thread_id = hotPost.thread_id;
            this.post_id = hotPost.post_id;
            this.user_name = hotPost.user_name;
            this.user_id = hotPost.user_id;
            this.post_zan = hotPost.post_zan;
            this.post_num = hotPost.post_num;
            this.content = Message.copyOf(hotPost.content);
            this.create_time = hotPost.create_time;
            this.floor = hotPost.floor;
            this.portrait = hotPost.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotPost build(boolean z) {
            return new HotPost(this, z);
        }
    }

    public HotPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.post_id;
            if (l2 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l2;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            this.post_zan = builder.post_zan;
            Integer num = builder.post_num;
            if (num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.create_time;
            if (num2 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num2;
            }
            Integer num3 = builder.floor;
            if (num3 == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num3;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str2;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.post_zan = builder.post_zan;
        this.post_num = builder.post_num;
        this.content = Message.immutableCopyOf(builder.content);
        this.create_time = builder.create_time;
        this.floor = builder.floor;
        this.portrait = builder.portrait;
    }
}
