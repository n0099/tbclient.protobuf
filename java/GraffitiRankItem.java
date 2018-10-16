package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
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

    private GraffitiRankItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.gid == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = builder.gid;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.vote_count == null) {
                this.vote_count = DEFAULT_VOTE_COUNT;
            } else {
                this.vote_count = builder.vote_count;
            }
            if (builder.is_vote == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = builder.is_vote;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.pic_id == null) {
                this.pic_id = "";
            } else {
                this.pic_id = builder.pic_id;
            }
            if (builder.g_type == null) {
                this.g_type = DEFAULT_G_TYPE;
            } else {
                this.g_type = builder.g_type;
            }
            if (builder.thumb_url == null) {
                this.thumb_url = "";
                return;
            } else {
                this.thumb_url = builder.thumb_url;
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

    /* loaded from: classes4.dex */
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
            if (graffitiRankItem != null) {
                this.gid = graffitiRankItem.gid;
                this.url = graffitiRankItem.url;
                this.vote_count = graffitiRankItem.vote_count;
                this.is_vote = graffitiRankItem.is_vote;
                this.uid = graffitiRankItem.uid;
                this.pic_id = graffitiRankItem.pic_id;
                this.g_type = graffitiRankItem.g_type;
                this.thumb_url = graffitiRankItem.thumb_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiRankItem build(boolean z) {
            return new GraffitiRankItem(this, z);
        }
    }
}
