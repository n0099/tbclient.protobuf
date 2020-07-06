package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TAB_ID = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1195common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tab_id;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1195common = builder.f1196common;
            if (builder.tab_id == null) {
                this.tab_id = "";
                return;
            } else {
                this.tab_id = builder.tab_id;
                return;
            }
        }
        this.f1195common = builder.f1196common;
        this.tab_id = builder.tab_id;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1196common;
        public String tab_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1196common = dataReq.f1195common;
                this.tab_id = dataReq.tab_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
