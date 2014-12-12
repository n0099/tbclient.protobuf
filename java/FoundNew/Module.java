package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Module extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Menu> menu_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<Menu> DEFAULT_MENU_LIST = Collections.emptyList();

    /* synthetic */ Module(Builder builder, boolean z, Module module) {
        this(builder, z);
    }

    private Module(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.menu_list == null) {
                this.menu_list = DEFAULT_MENU_LIST;
                return;
            } else {
                this.menu_list = immutableCopyOf(builder.menu_list);
                return;
            }
        }
        this.type = builder.type;
        this.menu_list = immutableCopyOf(builder.menu_list);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<Module> {
        public List<Menu> menu_list;
        public Integer type;

        public Builder(Module module) {
            super(module);
            if (module != null) {
                this.type = module.type;
                this.menu_list = Module.copyOf(module.menu_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Module build(boolean z) {
            return new Module(this, z, null);
        }
    }
}
