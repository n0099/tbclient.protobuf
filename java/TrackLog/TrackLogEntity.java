package tbclient.TrackLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BaseInfo;
import tbclient.DebugInfo;
import tbclient.Kpi;
/* loaded from: classes9.dex */
public final class TrackLogEntity extends Message {
    @ProtoField(tag = 1)
    public final BaseInfo base_info;
    @ProtoField(tag = 2)
    public final DebugInfo debug_info;
    @ProtoField(tag = 3)
    public final Kpi kpi;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TrackLogEntity> {
        public BaseInfo base_info;
        public DebugInfo debug_info;
        public Kpi kpi;

        public Builder() {
        }

        public Builder(TrackLogEntity trackLogEntity) {
            super(trackLogEntity);
            if (trackLogEntity == null) {
                return;
            }
            this.base_info = trackLogEntity.base_info;
            this.debug_info = trackLogEntity.debug_info;
            this.kpi = trackLogEntity.kpi;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TrackLogEntity build(boolean z) {
            return new TrackLogEntity(this, z);
        }
    }

    public TrackLogEntity(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.base_info = builder.base_info;
            this.debug_info = builder.debug_info;
            this.kpi = builder.kpi;
            return;
        }
        this.base_info = builder.base_info;
        this.debug_info = builder.debug_info;
        this.kpi = builder.kpi;
    }
}
