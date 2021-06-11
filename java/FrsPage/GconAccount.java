package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class GconAccount extends Message {
    public static final Integer DEFAULT_HAS_ACCOUNT = 0;
    public static final String DEFAULT_MENU_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_account;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String menu_name;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<GconAccount> {
        public Integer has_account;
        public String menu_name;

        public Builder() {
        }

        public Builder(GconAccount gconAccount) {
            super(gconAccount);
            if (gconAccount == null) {
                return;
            }
            this.has_account = gconAccount.has_account;
            this.menu_name = gconAccount.menu_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GconAccount build(boolean z) {
            return new GconAccount(this, z);
        }
    }

    public GconAccount(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.has_account;
            if (num == null) {
                this.has_account = DEFAULT_HAS_ACCOUNT;
            } else {
                this.has_account = num;
            }
            String str = builder.menu_name;
            if (str == null) {
                this.menu_name = "";
                return;
            } else {
                this.menu_name = str;
                return;
            }
        }
        this.has_account = builder.has_account;
        this.menu_name = builder.menu_name;
    }
}
