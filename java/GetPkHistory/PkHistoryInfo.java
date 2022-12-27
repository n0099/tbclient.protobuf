package tbclient.GetPkHistory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AlaUserInfo;
import tbclient.PkInfo;
/* loaded from: classes9.dex */
public final class PkHistoryInfo extends Message {
    @ProtoField(tag = 2)
    public final PkInfo pk_info;
    @ProtoField(tag = 3)
    public final AlaUserInfo rival_info;
    @ProtoField(tag = 1)
    public final AlaUserInfo user_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PkHistoryInfo> {
        public PkInfo pk_info;
        public AlaUserInfo rival_info;
        public AlaUserInfo user_info;

        public Builder() {
        }

        public Builder(PkHistoryInfo pkHistoryInfo) {
            super(pkHistoryInfo);
            if (pkHistoryInfo == null) {
                return;
            }
            this.user_info = pkHistoryInfo.user_info;
            this.pk_info = pkHistoryInfo.pk_info;
            this.rival_info = pkHistoryInfo.rival_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkHistoryInfo build(boolean z) {
            return new PkHistoryInfo(this, z);
        }
    }

    public PkHistoryInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            this.pk_info = builder.pk_info;
            this.rival_info = builder.rival_info;
            return;
        }
        this.user_info = builder.user_info;
        this.pk_info = builder.pk_info;
        this.rival_info = builder.rival_info;
    }
}
