package tbclient.KillAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AdObjReq extends Message {
    public static final String DEFAULT_PAGE_NAME = "";
    public static final String DEFAULT_POS_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer page_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pos_name;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_PAGE_NUM = 0;

    private AdObjReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.page_name == null) {
                this.page_name = "";
            } else {
                this.page_name = builder.page_name;
            }
            if (builder.page_num == null) {
                this.page_num = DEFAULT_PAGE_NUM;
            } else {
                this.page_num = builder.page_num;
            }
            if (builder.pos_name == null) {
                this.pos_name = "";
                return;
            } else {
                this.pos_name = builder.pos_name;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.page_name = builder.page_name;
        this.page_num = builder.page_num;
        this.pos_name = builder.pos_name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AdObjReq> {
        public Long forum_id;
        public String page_name;
        public Integer page_num;
        public String pos_name;

        public Builder() {
        }

        public Builder(AdObjReq adObjReq) {
            super(adObjReq);
            if (adObjReq != null) {
                this.forum_id = adObjReq.forum_id;
                this.page_name = adObjReq.page_name;
                this.page_num = adObjReq.page_num;
                this.pos_name = adObjReq.pos_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdObjReq build(boolean z) {
            return new AdObjReq(this, z);
        }
    }
}
