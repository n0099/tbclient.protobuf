package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes6.dex */
public final class ActivitySponsor extends Message {
    public static final Integer DEFAULT_IS_SPONSOR = 0;
    public static final String DEFAULT_SPONSOR_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_sponsor;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sponsor_url;

    private ActivitySponsor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_sponsor == null) {
                this.is_sponsor = DEFAULT_IS_SPONSOR;
            } else {
                this.is_sponsor = builder.is_sponsor;
            }
            if (builder.sponsor_url == null) {
                this.sponsor_url = "";
                return;
            } else {
                this.sponsor_url = builder.sponsor_url;
                return;
            }
        }
        this.is_sponsor = builder.is_sponsor;
        this.sponsor_url = builder.sponsor_url;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<ActivitySponsor> {
        public Integer is_sponsor;
        public String sponsor_url;

        public Builder() {
        }

        public Builder(ActivitySponsor activitySponsor) {
            super(activitySponsor);
            if (activitySponsor != null) {
                this.is_sponsor = activitySponsor.is_sponsor;
                this.sponsor_url = activitySponsor.sponsor_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActivitySponsor build(boolean z) {
            return new ActivitySponsor(this, z);
        }
    }
}
