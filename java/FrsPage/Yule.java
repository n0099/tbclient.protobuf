package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Yule extends Message {
    public static final Integer DEFAULT_ACTIVITY_SHOW = 0;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer activity_show;
    @ProtoField(tag = 1)
    public final YuleActivity yule_activity;

    private Yule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.yule_activity = builder.yule_activity;
            if (builder.activity_show == null) {
                this.activity_show = DEFAULT_ACTIVITY_SHOW;
                return;
            } else {
                this.activity_show = builder.activity_show;
                return;
            }
        }
        this.yule_activity = builder.yule_activity;
        this.activity_show = builder.activity_show;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Yule> {
        public Integer activity_show;
        public YuleActivity yule_activity;

        public Builder() {
        }

        public Builder(Yule yule) {
            super(yule);
            if (yule != null) {
                this.yule_activity = yule.yule_activity;
                this.activity_show = yule.activity_show;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Yule build(boolean z) {
            return new Yule(this, z);
        }
    }
}