package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LevelRes extends Message {
    @ProtoField(tag = 1)
    public final LevelPop pop;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LevelRes> {
        public LevelPop pop;

        public Builder() {
        }

        public Builder(LevelRes levelRes) {
            super(levelRes);
            if (levelRes == null) {
                return;
            }
            this.pop = levelRes.pop;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LevelRes build(boolean z) {
            return new LevelRes(this, z);
        }
    }

    public LevelRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.pop = builder.pop;
        } else {
            this.pop = builder.pop;
        }
    }
}
