package tbclient.LogTogether;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    public static final List<AdReq> DEFAULT_AD = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AdReq> Ad;
    @ProtoField(tag = 2)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1157common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.Ad == null) {
                this.Ad = DEFAULT_AD;
            } else {
                this.Ad = immutableCopyOf(builder.Ad);
            }
            this.f1157common = builder.f1158common;
            return;
        }
        this.Ad = immutableCopyOf(builder.Ad);
        this.f1157common = builder.f1158common;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<AdReq> Ad;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1158common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.Ad = DataReq.copyOf(dataReq.Ad);
                this.f1158common = dataReq.f1157common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
