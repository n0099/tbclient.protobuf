package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AlaUserlike extends Message {
    @ProtoField(tag = 2)
    public final AlaLiveInfo ala_live_info;
    @ProtoField(tag = 1)
    public final User user;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AlaUserlike> {
        public AlaLiveInfo ala_live_info;
        public User user;

        public Builder() {
        }

        public Builder(AlaUserlike alaUserlike) {
            super(alaUserlike);
            if (alaUserlike == null) {
                return;
            }
            this.user = alaUserlike.user;
            this.ala_live_info = alaUserlike.ala_live_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaUserlike build(boolean z) {
            return new AlaUserlike(this, z);
        }
    }

    public AlaUserlike(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user = builder.user;
            this.ala_live_info = builder.ala_live_info;
            return;
        }
        this.user = builder.user;
        this.ala_live_info = builder.ala_live_info;
    }
}
