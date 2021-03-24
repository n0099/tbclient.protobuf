package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GraffitiRankItem extends Message {
    public static final String DEFAULT_PIC_ID = "";
    public static final String DEFAULT_THUMB_URL = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer g_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_vote;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String pic_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String thumb_url;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long vote_count;
    public static final Long DEFAULT_GID = 0L;
    public static final Long DEFAULT_VOTE_COUNT = 0L;
    public static final Integer DEFAULT_IS_VOTE = 0;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_G_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GraffitiRankItem> {
        public Integer g_type;
        public Long gid;
        public Integer is_vote;
        public String pic_id;
        public String thumb_url;
        public Long uid;
        public String url;
        public Long vote_count;

        public Builder() {
        }

        public Builder(GraffitiRankItem graffitiRankItem) {
            super(graffitiRankItem);
            if (graffitiRankItem == null) {
                return;
            }
            this.gid = graffitiRankItem.gid;
            this.url = graffitiRankItem.url;
            this.vote_count = graffitiRankItem.vote_count;
            this.is_vote = graffitiRankItem.is_vote;
            this.uid = graffitiRankItem.uid;
            this.pic_id = graffitiRankItem.pic_id;
            this.g_type = graffitiRankItem.g_type;
            this.thumb_url = graffitiRankItem.thumb_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiRankItem build(boolean z) {
            return new GraffitiRankItem(this, z);
        }
    }

    public GraffitiRankItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.gid;
            if (l == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = l;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            Long l2 = builder.vote_count;
            if (l2 == null) {
                this.vote_count = DEFAULT_VOTE_COUNT;
            } else {
                this.vote_count = l2;
            }
            Integer num = builder.is_vote;
            if (num == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = num;
            }
            Long l3 = builder.uid;
            if (l3 == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l3;
            }
            String str2 = builder.pic_id;
            if (str2 == null) {
                this.pic_id = "";
            } else {
                this.pic_id = str2;
            }
            Integer num2 = builder.g_type;
            if (num2 == null) {
                this.g_type = DEFAULT_G_TYPE;
            } else {
                this.g_type = num2;
            }
            String str3 = builder.thumb_url;
            if (str3 == null) {
                this.thumb_url = "";
                return;
            } else {
                this.thumb_url = str3;
                return;
            }
        }
        this.gid = builder.gid;
        this.url = builder.url;
        this.vote_count = builder.vote_count;
        this.is_vote = builder.is_vote;
        this.uid = builder.uid;
        this.pic_id = builder.pic_id;
        this.g_type = builder.g_type;
        this.thumb_url = builder.thumb_url;
    }
}
