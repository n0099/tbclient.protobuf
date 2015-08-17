package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GconAccount extends Message {
    public static final Integer DEFAULT_HAS_ACCOUNT = 0;
    public static final String DEFAULT_MENU_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_account;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String menu_name;

    /* synthetic */ GconAccount(Builder builder, boolean z, GconAccount gconAccount) {
        this(builder, z);
    }

    private GconAccount(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.has_account == null) {
                this.has_account = DEFAULT_HAS_ACCOUNT;
            } else {
                this.has_account = builder.has_account;
            }
            if (builder.menu_name == null) {
                this.menu_name = "";
                return;
            } else {
                this.menu_name = builder.menu_name;
                return;
            }
        }
        this.has_account = builder.has_account;
        this.menu_name = builder.menu_name;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GconAccount> {
        public Integer has_account;
        public String menu_name;

        public Builder() {
        }

        public Builder(GconAccount gconAccount) {
            super(gconAccount);
            if (gconAccount != null) {
                this.has_account = gconAccount.has_account;
                this.menu_name = gconAccount.menu_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GconAccount build(boolean z) {
            return new GconAccount(this, z, null);
        }
    }
}
