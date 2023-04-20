package tbclient.AdKillerListAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AdTypeReq extends Message {
    public static final String DEFAULT_PAGE_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer page_num;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_PAGE_NUM = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AdTypeReq> {
        public Long forum_id;
        public String page_name;
        public Integer page_num;

        public Builder() {
        }

        public Builder(AdTypeReq adTypeReq) {
            super(adTypeReq);
            if (adTypeReq == null) {
                return;
            }
            this.forum_id = adTypeReq.forum_id;
            this.page_name = adTypeReq.page_name;
            this.page_num = adTypeReq.page_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdTypeReq build(boolean z) {
            return new AdTypeReq(this, z);
        }
    }

    public AdTypeReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.page_name;
            if (str == null) {
                this.page_name = "";
            } else {
                this.page_name = str;
            }
            Integer num = builder.page_num;
            if (num == null) {
                this.page_num = DEFAULT_PAGE_NUM;
                return;
            } else {
                this.page_num = num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.page_name = builder.page_name;
        this.page_num = builder.page_num;
    }
}
