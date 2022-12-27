package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Module extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Menu> menu_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<Menu> DEFAULT_MENU_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Module> {
        public List<Menu> menu_list;
        public Integer type;

        public Builder() {
        }

        public Builder(Module module) {
            super(module);
            if (module == null) {
                return;
            }
            this.type = module.type;
            this.menu_list = Message.copyOf(module.menu_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Module build(boolean z) {
            return new Module(this, z);
        }
    }

    public Module(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            List<Menu> list = builder.menu_list;
            if (list == null) {
                this.menu_list = DEFAULT_MENU_LIST;
                return;
            } else {
                this.menu_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.menu_list = Message.immutableCopyOf(builder.menu_list);
    }
}
