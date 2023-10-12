package org.mtr.mod.block;

import org.mtr.libraries.it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.BlockEntityTypes;

import javax.annotation.Nonnull;
import java.util.List;

public class BlockTrainRedstoneSensor extends BlockTrainPoweredSensorBase {

	public BlockTrainRedstoneSensor() {
		super();
	}

	@Nonnull
	@Override
	public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
		return new BlockEntity(blockPos, blockState);
	}

	@Override
	public void addBlockProperties(List<HolderBase<?>> properties) {
		properties.add(POWERED);
	}

	public static class BlockEntity extends BlockEntityBase {

		public BlockEntity(BlockPos pos, BlockState state) {
			super(BlockEntityTypes.TRAIN_REDSTONE_SENSOR.get(), pos, state);
		}

		@Override
		public void setData(LongAVLTreeSet filterRouteIds, boolean stoppedOnly, boolean movingOnly, int number, String... strings) {
			setData(filterRouteIds, stoppedOnly, movingOnly);
		}
	}
}
