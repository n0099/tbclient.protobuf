package tbclient.MFollow;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final List<String> DEFAULT_PORTRAIT = Collections.emptyList();
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f68541common;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> portrait;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f68542common;
        public List<String> portrait;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f68542common = dataReq.f68541common;
            this.portrait = Message.copyOf(dataReq.portrait);
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
            this.f68541common = builder.f68542common;
            List<String> list = builder.portrait;
            if (list == null) {
                this.portrait = DEFAULT_PORTRAIT;
                return;
            } else {
                this.portrait = Message.immutableCopyOf(list);
                return;
            }
        }
        this.f68541common = builder.f68542common;
        this.portrait = Message.immutableCopyOf(builder.portrait);
    }
}
