package tbclient.MFollow;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes11.dex */
public final class DataReq extends Message {
    public static final List<String> DEFAULT_PORTRAIT = Collections.emptyList();
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1209common;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> portrait;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1209common = builder.f1210common;
            if (builder.portrait == null) {
                this.portrait = DEFAULT_PORTRAIT;
                return;
            } else {
                this.portrait = immutableCopyOf(builder.portrait);
                return;
            }
        }
        this.f1209common = builder.f1210common;
        this.portrait = immutableCopyOf(builder.portrait);
    }

    /* loaded from: classes11.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1210common;
        public List<String> portrait;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1210common = dataReq.f1209common;
                this.portrait = DataReq.copyOf(dataReq.portrait);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
