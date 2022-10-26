package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ItemRankInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_HAS_MORE;
    public static final List<Item> DEFAULT_ITEM_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Item> item_list;
    @ProtoField(tag = 1)
    public final FrsTabInfo tab_info;
    @ProtoField(tag = 3)
    public final ModuleTitleInfo title_info;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer has_more;
        public List item_list;
        public FrsTabInfo tab_info;
        public ModuleTitleInfo title_info;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ItemRankInfo itemRankInfo) {
            super(itemRankInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {itemRankInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (itemRankInfo == null) {
                return;
            }
            this.tab_info = itemRankInfo.tab_info;
            this.item_list = Message.copyOf(itemRankInfo.item_list);
            this.title_info = itemRankInfo.title_info;
            this.has_more = itemRankInfo.has_more;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemRankInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ItemRankInfo(this, z, null);
            }
            return (ItemRankInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1163415044, "Ltbclient/ItemRankInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1163415044, "Ltbclient/ItemRankInfo;");
                return;
            }
        }
        DEFAULT_ITEM_LIST = Collections.emptyList();
        DEFAULT_HAS_MORE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemRankInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            this.tab_info = builder.tab_info;
            List list = builder.item_list;
            if (list == null) {
                this.item_list = DEFAULT_ITEM_LIST;
            } else {
                this.item_list = Message.immutableCopyOf(list);
            }
            this.title_info = builder.title_info;
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.tab_info = builder.tab_info;
        this.item_list = Message.immutableCopyOf(builder.item_list);
        this.title_info = builder.title_info;
        this.has_more = builder.has_more;
    }

    public /* synthetic */ ItemRankInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
