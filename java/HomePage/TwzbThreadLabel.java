package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TwzbThreadLabel extends Message {
    public static final Long DEFAULT_AMOUNT = 0L;
    public static final String DEFAULT_DESC = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long amount;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String desc;

    /* synthetic */ TwzbThreadLabel(Builder builder, boolean z, TwzbThreadLabel twzbThreadLabel) {
        this(builder, z);
    }

    private TwzbThreadLabel(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.amount == null) {
                this.amount = DEFAULT_AMOUNT;
                return;
            } else {
                this.amount = builder.amount;
                return;
            }
        }
        this.desc = builder.desc;
        this.amount = builder.amount;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<TwzbThreadLabel> {
        public Long amount;
        public String desc;

        public Builder() {
        }

        public Builder(TwzbThreadLabel twzbThreadLabel) {
            super(twzbThreadLabel);
            if (twzbThreadLabel != null) {
                this.desc = twzbThreadLabel.desc;
                this.amount = twzbThreadLabel.amount;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwzbThreadLabel build(boolean z) {
            return new TwzbThreadLabel(this, z, null);
        }
    }
}
