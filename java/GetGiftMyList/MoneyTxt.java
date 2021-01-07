package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class MoneyTxt extends Message {
    public static final String DEFAULT_TXT = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String txt;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private MoneyTxt(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.txt == null) {
                this.txt = "";
            } else {
                this.txt = builder.txt;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.txt = builder.txt;
        this.url = builder.url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MoneyTxt> {
        public String txt;
        public String url;

        public Builder() {
        }

        public Builder(MoneyTxt moneyTxt) {
            super(moneyTxt);
            if (moneyTxt != null) {
                this.txt = moneyTxt.txt;
                this.url = moneyTxt.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MoneyTxt build(boolean z) {
            return new MoneyTxt(this, z);
        }
    }
}
