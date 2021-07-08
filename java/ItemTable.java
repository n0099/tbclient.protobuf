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
public final class ItemTable extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_COMMENT_STAR;
    public static final Integer DEFAULT_IS_COMMENTED;
    public static final List<ItemPlot> DEFAULT_ITEM_PLOT;
    public static final List<ItemPoint> DEFAULT_ITEM_POINT;
    public static final Integer DEFAULT_TOTAL_POINT_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer comment_star;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_commented;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ItemPlot> item_plot;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<ItemPoint> item_point;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer total_point_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ItemTable> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer comment_star;
        public Integer is_commented;
        public List<ItemPlot> item_plot;
        public List<ItemPoint> item_point;
        public Integer total_point_num;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ItemTable itemTable) {
            super(itemTable);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {itemTable};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (itemTable == null) {
                return;
            }
            this.is_commented = itemTable.is_commented;
            this.comment_star = itemTable.comment_star;
            this.total_point_num = itemTable.total_point_num;
            this.item_point = Message.copyOf(itemTable.item_point);
            this.item_plot = Message.copyOf(itemTable.item_plot);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemTable build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ItemTable(this, z, null) : (ItemTable) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-985118838, "Ltbclient/ItemTable;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-985118838, "Ltbclient/ItemTable;");
                return;
            }
        }
        DEFAULT_IS_COMMENTED = 0;
        DEFAULT_COMMENT_STAR = 0;
        DEFAULT_TOTAL_POINT_NUM = 0;
        DEFAULT_ITEM_POINT = Collections.emptyList();
        DEFAULT_ITEM_PLOT = Collections.emptyList();
    }

    public /* synthetic */ ItemTable(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemTable(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.is_commented;
            if (num == null) {
                this.is_commented = DEFAULT_IS_COMMENTED;
            } else {
                this.is_commented = num;
            }
            Integer num2 = builder.comment_star;
            if (num2 == null) {
                this.comment_star = DEFAULT_COMMENT_STAR;
            } else {
                this.comment_star = num2;
            }
            Integer num3 = builder.total_point_num;
            if (num3 == null) {
                this.total_point_num = DEFAULT_TOTAL_POINT_NUM;
            } else {
                this.total_point_num = num3;
            }
            List<ItemPoint> list = builder.item_point;
            if (list == null) {
                this.item_point = DEFAULT_ITEM_POINT;
            } else {
                this.item_point = Message.immutableCopyOf(list);
            }
            List<ItemPlot> list2 = builder.item_plot;
            if (list2 == null) {
                this.item_plot = DEFAULT_ITEM_PLOT;
                return;
            } else {
                this.item_plot = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.is_commented = builder.is_commented;
        this.comment_star = builder.comment_star;
        this.total_point_num = builder.total_point_num;
        this.item_point = Message.immutableCopyOf(builder.item_point);
        this.item_plot = Message.immutableCopyOf(builder.item_plot);
    }
}
