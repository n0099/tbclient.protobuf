package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ModuleInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer max_module_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer max_module_thread_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadModule> module_list;
    public static final List<ThreadModule> DEFAULT_MODULE_LIST = Collections.emptyList();
    public static final Integer DEFAULT_MAX_MODULE_NUM = 0;
    public static final Integer DEFAULT_MAX_MODULE_THREAD_NUM = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ModuleInfo> {
        public Integer max_module_num;
        public Integer max_module_thread_num;
        public List<ThreadModule> module_list;

        public Builder() {
        }

        public Builder(ModuleInfo moduleInfo) {
            super(moduleInfo);
            if (moduleInfo == null) {
                return;
            }
            this.module_list = Message.copyOf(moduleInfo.module_list);
            this.max_module_num = moduleInfo.max_module_num;
            this.max_module_thread_num = moduleInfo.max_module_thread_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ModuleInfo build(boolean z) {
            return new ModuleInfo(this, z);
        }
    }

    public ModuleInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadModule> list = builder.module_list;
            if (list == null) {
                this.module_list = DEFAULT_MODULE_LIST;
            } else {
                this.module_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.max_module_num;
            if (num == null) {
                this.max_module_num = DEFAULT_MAX_MODULE_NUM;
            } else {
                this.max_module_num = num;
            }
            Integer num2 = builder.max_module_thread_num;
            if (num2 == null) {
                this.max_module_thread_num = DEFAULT_MAX_MODULE_THREAD_NUM;
                return;
            } else {
                this.max_module_thread_num = num2;
                return;
            }
        }
        this.module_list = Message.immutableCopyOf(builder.module_list);
        this.max_module_num = builder.max_module_num;
        this.max_module_thread_num = builder.max_module_thread_num;
    }
}
