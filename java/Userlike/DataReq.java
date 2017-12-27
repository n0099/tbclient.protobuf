package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_LAST_REQ_UNIX = 0L;
    public static final String DEFAULT_PAGE_TAG = "";
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long last_req_unix;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String page_tag;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.page_tag == null) {
                this.page_tag = "";
            } else {
                this.page_tag = builder.page_tag;
            }
            if (builder.last_req_unix == null) {
                this.last_req_unix = DEFAULT_LAST_REQ_UNIX;
                return;
            } else {
                this.last_req_unix = builder.last_req_unix;
                return;
            }
        }
        this.common = builder.common;
        this.page_tag = builder.page_tag;
        this.last_req_unix = builder.last_req_unix;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long last_req_unix;
        public String page_tag;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.page_tag = dataReq.page_tag;
                this.last_req_unix = dataReq.last_req_unix;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
