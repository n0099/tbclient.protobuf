package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class UserModule extends Message {
    public static final List<ModuleItem> DEFAULT_ITEMS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ModuleItem> items;

    /* synthetic */ UserModule(Builder builder, boolean z, UserModule userModule) {
        this(builder, z);
    }

    private UserModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.items == null) {
                this.items = DEFAULT_ITEMS;
                return;
            } else {
                this.items = immutableCopyOf(builder.items);
                return;
            }
        }
        this.items = immutableCopyOf(builder.items);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<UserModule> {
        public List<ModuleItem> items;

        public Builder() {
        }

        public Builder(UserModule userModule) {
            super(userModule);
            if (userModule != null) {
                this.items = UserModule.copyOf(userModule.items);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserModule build(boolean z) {
            return new UserModule(this, z, null);
        }
    }
}
