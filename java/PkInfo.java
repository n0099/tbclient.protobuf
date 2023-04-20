package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PkInfo extends Message {
    @ProtoField(tag = 2)
    public final PkLiveInfo anchor_info;
    @ProtoField(tag = 1)
    public final PkCoreInfo pk_info;
    @ProtoField(tag = 3)
    public final PkLiveInfo rival_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PkInfo> {
        public PkLiveInfo anchor_info;
        public PkCoreInfo pk_info;
        public PkLiveInfo rival_info;

        public Builder() {
        }

        public Builder(PkInfo pkInfo) {
            super(pkInfo);
            if (pkInfo == null) {
                return;
            }
            this.pk_info = pkInfo.pk_info;
            this.anchor_info = pkInfo.anchor_info;
            this.rival_info = pkInfo.rival_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkInfo build(boolean z) {
            return new PkInfo(this, z);
        }
    }

    public PkInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.pk_info = builder.pk_info;
            this.anchor_info = builder.anchor_info;
            this.rival_info = builder.rival_info;
            return;
        }
        this.pk_info = builder.pk_info;
        this.anchor_info = builder.anchor_info;
        this.rival_info = builder.rival_info;
    }
}
