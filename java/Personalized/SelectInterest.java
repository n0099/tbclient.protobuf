package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class SelectInterest extends Message {
    public static final String DEFAULT_SELECT_INTEREST_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String select_interest_name;

    private SelectInterest(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.select_interest_name == null) {
                this.select_interest_name = "";
                return;
            } else {
                this.select_interest_name = builder.select_interest_name;
                return;
            }
        }
        this.select_interest_name = builder.select_interest_name;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<SelectInterest> {
        public String select_interest_name;

        public Builder() {
        }

        public Builder(SelectInterest selectInterest) {
            super(selectInterest);
            if (selectInterest != null) {
                this.select_interest_name = selectInterest.select_interest_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SelectInterest build(boolean z) {
            return new SelectInterest(this, z);
        }
    }
}
