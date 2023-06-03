package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TAB_CODE = "";
    public static final String DEFAULT_TAB_ID = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1428common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_code;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_id;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1429common;
        public String tab_code;
        public String tab_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1429common = dataReq.f1428common;
            this.tab_id = dataReq.tab_id;
            this.tab_code = dataReq.tab_code;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1428common = builder.f1429common;
            String str = builder.tab_id;
            if (str == null) {
                this.tab_id = "";
            } else {
                this.tab_id = str;
            }
            String str2 = builder.tab_code;
            if (str2 == null) {
                this.tab_code = "";
                return;
            } else {
                this.tab_code = str2;
                return;
            }
        }
        this.f1428common = builder.f1429common;
        this.tab_id = builder.tab_id;
        this.tab_code = builder.tab_code;
    }
}
