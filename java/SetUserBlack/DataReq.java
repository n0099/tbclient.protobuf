package tbclient.SetUserBlack;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
import tbclient.PermissionList;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_BLACK_UID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long black_uid;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1500common;
    @ProtoField(tag = 3)
    public final PermissionList perm_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long black_uid;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1501common;
        public PermissionList perm_list;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1501common = dataReq.f1500common;
            this.black_uid = dataReq.black_uid;
            this.perm_list = dataReq.perm_list;
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
            this.f1500common = builder.f1501common;
            Long l = builder.black_uid;
            if (l == null) {
                this.black_uid = DEFAULT_BLACK_UID;
            } else {
                this.black_uid = l;
            }
            this.perm_list = builder.perm_list;
            return;
        }
        this.f1500common = builder.f1501common;
        this.black_uid = builder.black_uid;
        this.perm_list = builder.perm_list;
    }
}
