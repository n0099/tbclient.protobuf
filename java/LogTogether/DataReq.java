package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final List<AdReq> DEFAULT_AD = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AdReq> Ad;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69548common;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<AdReq> Ad;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69549common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.Ad = Message.copyOf(dataReq.Ad);
            this.f69549common = dataReq.f69548common;
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
            List<AdReq> list = builder.Ad;
            if (list == null) {
                this.Ad = DEFAULT_AD;
            } else {
                this.Ad = Message.immutableCopyOf(list);
            }
            this.f69548common = builder.f69549common;
            return;
        }
        this.Ad = Message.immutableCopyOf(builder.Ad);
        this.f69548common = builder.f69549common;
    }
}
